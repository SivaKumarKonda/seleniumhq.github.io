const {Builder} = require('selenium-webdriver');

(async function helloSelenium() {
  let driver = await new Builder().forBrowser('chrome').build();

  await driver.get('https://selenium.dev');

  await driver.quit();
})();



function sivaHello(){
let sdriver = new Builder().forBrowser(`chrome`).build();

sdriver.get(`https://selenium.dev`);

sdriver.quit();

}
sivaHello();