from selenium import webdriver
import time

driver = webdriver.Chrome()

driver.get("https://www.baidu.com")
driver.implicitly_wait(30)
driver.find_element_by_id("kw").send_keys("我是真的爱你")
driver.find_element_by_id("su").click()

driver.quit()
