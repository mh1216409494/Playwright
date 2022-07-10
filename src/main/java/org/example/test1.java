package org.example;

import com.microsoft.playwright.Page;
import util.TraceUtil;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class test1 {

      public void  testBaidu(Page page){
          // Go to https://www.baidu.com/
          page.navigate("https://www.baidu.com/");
          // Click input[name="wd"]
          page.locator("input[name=\"wd\"]").click();
          // Fill input[name="wd"]
          page.locator("input[name=\"wd\"]").fill("QQ");
          // Click text=QQ音乐-千万正版音乐海量无损曲库新歌热歌天天畅...
          Page page1 = page.waitForPopup(() -> {
              page.locator("text=QQ音乐-千万正版音乐海量无损曲库新歌热歌天天畅...").click();
          });
          assertThat(page).hasURL("https://y.qq.com/");
          // Click a:has-text("排行榜")
          page1.locator("a:has-text(\"排行榜\")").click();
          assertThat(page1).hasURL("https://y.qq.com/n/ryqq/toplist/4");
          // Click text=再见莫妮卡 (新版)播放添加到歌单分享 >> i >> nth=0
          Page page2 = page1.waitForPopup(() -> {
              page1.locator("text=再见莫妮卡 (新版)播放添加到歌单分享 >> i").first().click();
          });
          assertThat(page1).hasURL("https://y.qq.com/n/ryqq/player");
          // Click div[role="dialog"]:has-text("QQ音乐提醒您由于您的浏览器设置，音乐无法自动播放，请手动点击播放。我知道了")
          page2.locator("div[role=\"dialog\"]:has-text(\"QQ音乐提醒您由于您的浏览器设置，音乐无法自动播放，请手动点击播放。我知道了\")").click();
          // Click div[role="dialog"]:has-text("QQ音乐提醒您由于您的浏览器设置，音乐无法自动播放，请手动点击播放。我知道了")
          page2.locator("div[role=\"dialog\"]:has-text(\"QQ音乐提醒您由于您的浏览器设置，音乐无法自动播放，请手动点击播放。我知道了\")").click();
          // Click text=我知道了
          page2.locator("text=我知道了").click();
          // Click a:has-text("播放") >> nth=1
          page2.locator("a:has-text(\"播放\")").nth(1).click();
          // Click a:has-text("播放") >> nth=1
          page2.locator("a:has-text(\"播放\")").nth(1).click();
          // Check text=1再见莫妮卡 (新版)播放添加到歌单分享晓悠02:26删除 >> input[type="checkbox"]
          page2.locator("text=1再见莫妮卡 (新版)播放添加到歌单分享晓悠02:26删除 >> input[type=\"checkbox\"]").check();
          // Click a:has-text("播放") >> nth=1
          page2.locator("a:has-text(\"播放\")").nth(1).click();
          // Click text=再见莫妮卡 (新版) >> nth=0
          Page page3 = page2.waitForPopup(() -> {
              page2.locator("text=再见莫妮卡 (新版)").first().click();
          });
          // Click text=播放智能曲谱收藏评论(1128)更多 >> i >> nth=0
          page3.locator("text=播放智能曲谱收藏评论(1128)更多 >> i").first().click();
          assertThat(page3).hasURL("https://y.qq.com/n/ryqq/player");
          // Click text=我知道了
          page2.locator("text=我知道了").click();

      }
}
