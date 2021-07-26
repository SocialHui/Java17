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
# 通过id定位输入框，id是唯一的
# driver.find_element_by_id("kw").send_keys("我是真的爱你")

# 通过name定位输入框，可能不是唯一的
# driver.find_element_by_name("wd").send_keys("我是真的爱你")

# 通过class name 定位
# 通过tag name 查找
# 通过xpath查找
# driver.find_element_by_xpath("//*[@id='kw']").send_keys("我是真的爱你")

# 通过css selector 查找
driver.find_element_by_css_selector("#kw").send_keys("我是真的爱你")

# 休眠3秒钟
time.sleep(3)

# 输入内容之后就点击搜索开始搜索
driver.find_element_by_id("su").click()

# 休眠3秒钟
time.sleep(3)

# 关闭当前窗口
driver.quit()
