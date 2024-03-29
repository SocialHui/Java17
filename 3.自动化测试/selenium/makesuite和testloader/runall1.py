import unittest
import testbaidu1
import testbaidu2


def createsuite():
    suite = unittest.TestSuite()
    # suite.addTest(unittest.makeSuite(testbaidu1.BaiDu1))
    # suite.addTest(unittest.makeSuite(testbaidu2.BaiDu2))
    suite1 = unittest.TestLoader().loadTestsFromTestCase(testbaidu1.BaiDu1)
    suite2 = unittest.TestLoader().loadTestsFromTestCase(testbaidu2.BaiDu2)
    suite = unittest.TestSuite([suite1,suite2])
    return suite

if __name__ == "__main__":
    suite = createsuite()
    runner = unittest.TextTestRunner()
    runner.run(suite)