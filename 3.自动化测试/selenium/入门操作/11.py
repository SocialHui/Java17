from selenium import webdriver
import time
import os

driver = webdriver.Chrome()

# 这样的写法代表当前路径下的文件的打开
file_path = 'file:///'+os.path.abspath("checkbox.html")
driver.get(file_path)
driver.maximize_window()

# 找到所有的标签是input的内容
inputs = driver.find_elements_by_tag_name('input')
# 通过for循环进行筛选
for input in inputs:
    if input.get_attribute('type') == 'checkbox':
        input.click()
time.sleep(3)
driver.quit()
