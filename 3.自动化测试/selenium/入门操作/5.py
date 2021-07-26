from selenium import webdriver
import time

driver = webdriver.Chrome()

driver.get("https://www.baidu.com")
time.sleep(1)
print(driver.title)
print(driver.current_url)

driver.quit()