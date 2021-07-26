from selenium import webdriver
import time

driver = webdriver.Chrome()

driver.get("https://www.baidu.com")
driver.maximize_window()
driver.find_element_by_id("kw").send_keys("我是真的爱你")
driver.find_element_by_id("su").click()
time.sleep(3)

# 将滚动条滚动到最低端
# 这句话的意思是距离页面顶端的距离是10000
js = "var q = document.documentElement.scrollTop=10000"
driver.execute_script(js)  # 执行js
time.sleep(3)

driver.quit()