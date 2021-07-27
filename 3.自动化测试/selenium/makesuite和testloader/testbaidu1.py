from selenium import webdriver
import time
import unittest

class BaiDu1(unittest.TestCase):

    # 测试固件
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.url = "https://www.baidu.com"
        self.driver.implicitly_wait(30)  # 智能等待时间
        self.driver.maximize_window()


    def test_ai(self):
        driver = self.driver
        driver.get(self.url)
        driver.find_element_by_id("kw").send_keys("你是我的荣耀")
        driver.find_element_by_id("su").click()
        time.sleep(3)


    def tearDown(self):
        driver = self.driver
        driver.quit()

    if __name__ == "__main__":
        unittest.main()
