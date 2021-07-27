from selenium import webdriver
import time
import unittest
from ddt import ddt,data


@ddt
class Testddt(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Chrome()
        self.url = "https://www.baidu.com"
        self.driver.maximize_window()

    def tearDown(self):
        self.driver.quit()

    @data("变成你的那一天", "你是我的荣耀", "我在他乡挺好的")
    def test_search1(self,value):
        driver = self.driver
        driver.get(self.url)
        driver.find_element_by_id("kw").send_keys(value)
        driver.find_element_by_id("su").click()
        time.sleep(1)


    if __name__ == "__main__":
        unittest.main()