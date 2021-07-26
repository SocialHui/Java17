from selenium import webdriver
import time

# 获得驱动
driver = webdriver.Chrome()

# 打开百度
driver.get("https://www.baidu.com")
# 打开百度之后将百度的界面放到最大
driver.maximize_window()
time.sleep(4)

# 通过id定位搜索框然后输入信息
driver.find_element_by_id("kw").send_keys("我爱你")
time.sleep(3)

# 不想搜索上面的内容了，删除之后重新输入信息
driver.find_element_by_id("kw").clear()
time.sleep(3)
driver.find_element_by_id("kw").send_keys("我是真的爱你")
time.sleep(3)

# 然后点击搜索进行搜索
# driver.find_element_by_id("su").click()
driver.find_element_by_id("su").submit()
time.sleep(3)

driver.quit()