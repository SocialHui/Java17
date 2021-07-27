from selenium import webdriver
import time
import unittest
import testbaidu1
import testbaidu2


def createsuite():
    suite = unittest.TestSuite()
    suite.addTest(testbaidu1.BaiDu1("test_ai"))
    suite.addTest(testbaidu2.BaiDu2("test_jia"))
    return suite

if __name__ == "__main__":
    suite = createsuite()
    runner = unittest.TextTestRunner()
    runner.run(suite)
