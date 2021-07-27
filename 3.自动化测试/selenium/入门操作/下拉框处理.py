from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains   # 鼠标事件导入的包
from selenium.webdriver.common.keys import Keys   # 键盘事件导入的包

driver = webdriver.Chrome()
file = "file:///"+os.path.abspath("alert.html")
driver.get(file)
driver.maximize_window()
time.sleep(3)

driver.find_element_by_link_text("hover to see tooltip").click()
time.sleep(3)

# 点击之后需要点击弹出框的确定按钮
# 获得操作句柄
alert = driver.switch_to.alert
# 点击确定按钮
# alert.accept()

# 获得弹出框的文字信息
text = alert.text
print(text)
time.sleep(2)



driver.quit()
