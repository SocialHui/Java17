from selenium import webdriver
import time

driver = webdriver.Chrome()

driver.get("https://www.baidu.com")
time.sleep(1)
# 获取文本信息
data = driver.find_element_by_id("su").text
# 打印文本信息
print(data)
time.sleep(1)

driver.quit()
