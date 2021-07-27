from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains   # 鼠标事件导入的包
from selenium.webdriver.common.keys import Keys   # 键盘事件导入的包

driver = webdriver.Chrome()
file = "file:///"+os.path.abspath("modal.html")
driver.get(file)
driver.maximize_window()
time.sleep(2)

driver.find_element_by_link_text("Click").click()
time.sleep(2)
linked = driver.find_element_by_id("myModal")
linked.find_element_by_id('click').click()
time.sleep(2)

# linked.find_element_by_xpath('//*[@id="myModal"]/div[3]/button[1]').click()
buttons = linked.find_elements_by_tag_name("button")
buttons[0].click()
time.sleep(2)

driver.quit()