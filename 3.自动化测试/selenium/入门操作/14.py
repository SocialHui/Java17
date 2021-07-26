# 下拉框处理

from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()

# 这样的写法代表当前路径下的文件的打开
file = "file:///"+os.path.abspath("drop_down.html")
driver.get(file)
time.sleep(4)
driver.maximize_window()

driver.find_element_by_xpath("//*[@id='ShippingMethod']/option[6]").click()
time.sleep(4)

driver.quit()