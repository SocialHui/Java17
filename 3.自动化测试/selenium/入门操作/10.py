# 鼠标事件

from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains  # 引入鼠标事件的包

driver = webdriver.Chrome()
driver.maximize_window()
driver.get("https://www.baidu.com")
time.sleep(2)

# 首先定位到要操作的对象
q = driver.find_element_by_xpath("//*[@id='su']")
# 然后操作
# 右键
ActionChains(driver).context_click(q).perform()
time.sleep(2)

driver.find_element_by_id("kw").send_keys("我是真的爱你")
driver.find_element_by_id("su").send_keys(Keys.ENTER)
time.sleep(2)

n = driver.find_element_by_partial_link_text("我是真的爱你(2021年吕行执导电视剧)")
# 双击
ActionChains(driver).double_click(n).perform()

# driver.find_element_by_partial_link_text("我是真的爱你(2021年吕行执导电视剧)").click()
# driver.find_element_by_xpath("//*[@id='1']/h3/a").click()
time.sleep(5)

driver.quit()