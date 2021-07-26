from selenium import webdriver
import time

driver = webdriver.Chrome()

driver.get("https://www.baidu.com")
driver.find_element_by_id("kw").send_keys("我是真的爱你")
time.sleep(3)

driver.find_element_by_id("su").click()
time.sleep(3)

driver.back()
time.sleep(3)

driver.forward()
time.sleep(3)

driver.quit()