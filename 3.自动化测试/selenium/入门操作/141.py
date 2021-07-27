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

# 直接选择要选择的数字，因为是在同一个页面里面，所以不需要先点下拉框
# driver.find_element_by_xpath("//*[@id='ShippingMethod']/option[5]").click()
# 先根据标签名字选中所有的标签为option的内容，然后循环选中要勾选的内容
options = driver.find_elements_by_tag_name("option")   # 注意用标签找的时候要用elements复数形式，因为用标签找出来的是一组数据
for option in options:
    if option.get_attribute('value') == '10.69':
        option.click()
time.sleep(4)

driver.quit()