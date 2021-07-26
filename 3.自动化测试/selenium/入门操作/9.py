from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
driver.get("https://www.baidu.com")
driver.maximize_window()
time.sleep(2)

driver.find_element_by_id("kw").send_keys("我是真的爱你")
time.sleep(3)

# Ctrl+a全选输入框内容
driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'a')
time.sleep(3)

# Ctrl+x 剪切输入框内容
driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'x')
time.sleep(3)

# 在输入框重新输入内容
driver.find_element_by_id("kw").send_keys("变成你的那一天")
driver.find_element_by_id("su").click()
time.sleep(3)

driver.quit()