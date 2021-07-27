from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains   # 鼠标事件导入的包
from selenium.webdriver.common.keys import Keys   # 键盘事件导入的包

driver = webdriver.Chrome()
file = "file:///"+os.path.abspath("send.html")
driver.get(file)
driver.maximize_window()
time.sleep(2)

driver.find_element_by_tag_name("input").click()
time.sleep(2)

# 获得操作句柄
alert = driver.switch_to.alert
alert.send_keys("加油")
time.sleep(2)
# alert.accept()
alert.dismiss()
time.sleep(2)

driver.quit()