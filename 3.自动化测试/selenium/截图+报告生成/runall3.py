import unittest
from selenium import webdriver
import HTMLTestRunner
import testbaidu1
import testbaidu2
import sys
import time,os

def createSuite():
    suite = unittest.TestSuite()
    suite.addTest(unittest.makeSuite(testbaidu1.BaiDu1))
    # suite.addTest(unittest.makeSuite(testbaidu2.BaiDu2))
    return suite

if __name__ == "__main__":
    # 创建当前文件夹
    # curpath = sys.path[0]
    # 取当前时间，用作命名
    now = time.strftime("%Y-%m-%H %M %S",time.localtime(time.time()))
    # 如果不存在文件夹，则创建
    # if not os.path.exists(curpath+'./resultreport'):
    #     os.makedirs(curpath+'./resultreport')

    # 生成的报告的名称
    filename = './resultreport'+now+"resultreport.html"

    with open(filename,"wb") as fp:
        runner = HTMLTestRunner.HTMLTestRunner(stream=fp,title=u'测试报告',description=u'用例执行情况',verbosity=2)
        # runner = HTMLTestRunner.HTMLTestRunner(stream=fp)
        suite = createSuite()
        runner.run(suite)