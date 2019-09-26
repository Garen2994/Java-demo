/*
Navicat MySQL Data Transfer

Source Server         : mysql80
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : myaccountapp

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-09-26 19:37:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sortname` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `money` double DEFAULT NULL,
  `pay_way` varchar(200) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  `description` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '吃饭支出', '247', '建设银行', '2019-03-02', '家庭聚餐');
INSERT INTO `account` VALUES ('2', '工资收入', '18000', '现金', '2019-03-15', '开工资了');
INSERT INTO `account` VALUES ('3', '服装支出', '1998', '现金', '2019-04-02', '买衣服');
INSERT INTO `account` VALUES ('4', '吃饭支出', '325', '现金', '2019-06-18', '朋友聚餐');
INSERT INTO `account` VALUES ('5', '股票收入', '8000', '招商银行', '2019-10-28', '股票大涨');
INSERT INTO `account` VALUES ('6', '股票收入', '5000', '招商银行', '2019-10-28', '股票又大涨');
INSERT INTO `account` VALUES ('7', '工资收入', '18000', '建设银行', '2019-10-28', '又开工资了');
INSERT INTO `account` VALUES ('8', '礼金支出', '5000', '现金', '2019-10-28', '朋友结婚');
INSERT INTO `account` VALUES ('9', '其他支出', '1560', '现金', '2019-10-29', '丢钱了');
INSERT INTO `account` VALUES ('10', '交通支出', '2300', '建设银行', '2019-10-29', '油价还在涨啊');
INSERT INTO `account` VALUES ('11', '吃饭支出', '1000', '招商银行', '2019-10-29', '又吃饭');
INSERT INTO `account` VALUES ('12', '工资收入', '18000', '现金', '2019-10-30', '开资');
INSERT INTO `account` VALUES ('13', '交通支出', '2000', '现金', '2019-10-30', '机票好贵');
INSERT INTO `account` VALUES ('14', '工资收入', '5000', '现金', '2019-10-30', '又开资了');
SET FOREIGN_KEY_CHECKS=1;
