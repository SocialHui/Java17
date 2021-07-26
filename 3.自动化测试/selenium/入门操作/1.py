from selenium import webdriver
import time

# 获得驱动
driver = webdriver.Chrome()

# 跳转到百度的界面了
driver.get("https://www.baidu.com")

# 休眠3秒钟
time.sleep(3)

# 跳转到百度的界面以后进行查询操作
# 先定位到输入框  然后在输入框输入想要搜索的内容
driver.find_element_by_id("kw").send_keys("我是真的爱你")

# 休眠3秒钟
time.sleep(3)

# 输入内容之后就点击搜索开始搜索
driver.find_element_by_id("su").click()

# 休眠3秒钟
time.sleep(3)

# 关闭当前窗口
driver.quit()
