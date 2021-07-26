# 键盘事件

from selenium import webdriver
# 需要引入keys包 (键盘包)
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Chrome()
driver.get("https://www.baidu.com")
driver.maximize_window()
time.sleep(3)

driver.find_element_by_id("kw").send_keys("qq音乐")
driver.find_element_by_id("kw").send_keys(Keys.ENTER)
time.sleep(3)

driver.quit()