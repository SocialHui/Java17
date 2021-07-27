from selenium import webdriver
import time
import unittest

class BaiDu2(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Chrome()
        self.url = "https://www.baidu.com"
        self.driver.maximize_window()
        self.driver.implicitly_wait(30)

    def test_jia(self):
        driver = self.driver
        driver.get(self.url)
        driver.find_element_by_id("kw").send_keys("变成你的那一天")
        driver.find_element_by_id("su").click()
        time.sleep(3)

    def tearDown(self):
        self.driver.quit()


    if __name__ == "__main__":
        unittest.main()