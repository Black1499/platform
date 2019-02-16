/*
Navicat MySQL Data Transfer

Source Server         : MariaDB
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : testdb

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-02-16 10:30:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(6) DEFAULT NULL,
  `education` varchar(6) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('001', '张三', '男', '本科', '3000.00');
INSERT INTO `employee` VALUES ('002', '李思', '男', '本科', '3700.00');
INSERT INTO `employee` VALUES ('003', '王武', '男', '本科', '3300.00');
INSERT INTO `employee` VALUES ('004', '邓元', '男', '硕士', '8000.00');
INSERT INTO `employee` VALUES ('10', '张昂', '男', '本科', '3500.00');
INSERT INTO `employee` VALUES ('11', '张昂', '男', '本科', '3500.00');
INSERT INTO `employee` VALUES ('12', '张昂', '男', '本科', '3500.00');
INSERT INTO `employee` VALUES ('7', '张昂', '男', '本科', '3500.00');
INSERT INTO `employee` VALUES ('8', '张昂', '男', '本科', '3500.00');
INSERT INTO `employee` VALUES ('9', '张昂', '男', '本科', '3500.00');
