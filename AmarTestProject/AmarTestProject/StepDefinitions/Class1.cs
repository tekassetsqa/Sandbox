using NUnit.Framework;
using OpenQA.Selenium.Chrome;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AmarTestProject.StepDefinitions
{
    public class Class1
    {
        [Test]
        public void Method1() {
            ChromeDriver driver = new ChromeDriver();
            driver.Navigate().GoToUrl("https://www.facebook.com");
           //siva is here
        }
    }
}
