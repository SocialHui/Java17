from selenium import webdriver
import time
import unittest
import os
import HTMLTestRunner

class Bai(unittest.TestCase):

    # 测试固件
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.get("https://www.baidu.com")
        self.driver.maximize_window()
        time.sleep(3)

    def tearDown(self):
        self.driver.quit()

    @unittest.skip("skipping")
    def test_search1(self):
        driver = self.driver
        driver.find_element_by_id("kw").send_keys("你是我的荣耀")
        driver.find_element_by_id("su").click()
        time.sleep(3)

    def test_search2(self):
        driver = self.driver
        driver.find_element_by_id("kw").send_keys("福禄寿乐队")
        driver.find_element_by_id("su").click()
        time.sleep(3)
        print(driver.title)
        try:
            self.assertEqual(driver.title,"福禄寿乐队",msg="不相等")
        except:    # 不相等的话来这里进行截图操作
            self.saveScreenShot(driver,"999.png")


    def saveScreenShot(self,driver,filename):
        # if not os.path.exists("./image"):
        #     os.makedirs("./image")
        now = time.strftime("%Y-%m-%d %H%M%S",time.localtime(time.time()))
        driver.get_screenshot_as_file(now+" "+filename)
        time.sleep(3)


    if __name__ == "__main__":
        unittest.main()

