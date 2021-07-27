from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains   # 鼠标事件导入的包
from selenium.webdriver.common.keys import Keys   # 键盘事件导入的包

driver = webdriver.Chrome()
file = "file:///"+os.path.abspath("upload.html")
driver.get(file)
driver.maximize_window()
time.sleep(2)

driver.find_element_by_name("file").send_keys("D:\\学校文件\\18407020505 盛慧.docx")
time.sleep(2)

driver.quit()