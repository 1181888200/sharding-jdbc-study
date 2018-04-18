/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : sharding_0

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2018-04-18 17:17:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_member_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_0`;
CREATE TABLE `t_member_0` (
  `id` varchar(80) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `card` varchar(255) DEFAULT NULL,
  `strategy` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_0
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_1`;
CREATE TABLE `t_member_1` (
  `id` varchar(80) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `card` varchar(255) DEFAULT NULL,
  `strategy` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_1
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_2`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_2`;
CREATE TABLE `t_member_2` (
  `id` varchar(80) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `card` varchar(255) DEFAULT NULL,
  `strategy` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_2
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_0`;
CREATE TABLE `t_order_0` (
  `order_id` bigint(11) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_0
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
  `order_id` bigint(11) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_1
-- ----------------------------

-- ----------------------------
-- Table structure for `t_order_2`
-- ----------------------------
DROP TABLE IF EXISTS `t_order_2`;
CREATE TABLE `t_order_2` (
  `order_id` bigint(11) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_2
-- ----------------------------

-- ----------------------------
-- Table structure for `t_student_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_student_0`;
CREATE TABLE `t_student_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_0
-- ----------------------------
INSERT INTO `t_student_0` VALUES ('3', '11', 'jack', '12');
INSERT INTO `t_student_0` VALUES ('4', '21', 'hehe', '21');
INSERT INTO `t_student_0` VALUES ('5', '21', 'hehe1', '21');
INSERT INTO `t_student_0` VALUES ('6', '21', 'hehe1', '21');
INSERT INTO `t_student_0` VALUES ('7', '21', 'hehe2222', '21');
INSERT INTO `t_student_0` VALUES ('8', '21', '异常....', '21');
INSERT INTO `t_student_0` VALUES ('11', '21', '异常....1111', '21');
INSERT INTO `t_student_0` VALUES ('12', '21', '异常....1111', '21');
INSERT INTO `t_student_0` VALUES ('14', '0', 'jack', '12');
INSERT INTO `t_student_0` VALUES ('15', '1100', '0000', '1200');
INSERT INTO `t_student_0` VALUES ('16', '1100', '0000', '1200');

-- ----------------------------
-- Table structure for `t_student_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_student_1`;
CREATE TABLE `t_student_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_1
-- ----------------------------
INSERT INTO `t_student_1` VALUES ('3', '11', 'jack', '12');
INSERT INTO `t_student_1` VALUES ('4', '21', 'hehe', '21');
INSERT INTO `t_student_1` VALUES ('5', '21', 'hehe1', '21');
INSERT INTO `t_student_1` VALUES ('6', '21', 'hehe1', '21');
INSERT INTO `t_student_1` VALUES ('7', '21', 'hehe2222', '21');
INSERT INTO `t_student_1` VALUES ('8', '21', '异常....', '21');
INSERT INTO `t_student_1` VALUES ('11', '21', '异常....1111', '21');
INSERT INTO `t_student_1` VALUES ('12', '21', '异常....1111', '21');
INSERT INTO `t_student_1` VALUES ('14', '0', 'jack', '12');

-- ----------------------------
-- Table structure for `t_trade_record_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_trade_record_0`;
CREATE TABLE `t_trade_record_0` (
  `id` varchar(80) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tradeId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_trade_record_0
-- ----------------------------
INSERT INTO `t_trade_record_0` VALUES ('12b8c98c-ced5-4798-8ba4-8978906ceaeb', 'two1', '6');
INSERT INTO `t_trade_record_0` VALUES ('19f201d9-276c-49b0-87ad-c4a3e1a05c98', 'two1', '6');
INSERT INTO `t_trade_record_0` VALUES ('3bb8ec7e-a5cb-4f62-8e45-77000a7ea04f', 'two1', '12');
INSERT INTO `t_trade_record_0` VALUES ('73405994-4401-44e7-954e-3c11515b6ad8', 'two1', '6');
INSERT INTO `t_trade_record_0` VALUES ('f44e7de1-8837-44c1-9132-b08514c81608', 'two1', '6');

-- ----------------------------
-- Table structure for `t_trade_record_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_trade_record_1`;
CREATE TABLE `t_trade_record_1` (
  `id` varchar(80) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tradeId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_trade_record_1
-- ----------------------------

-- ----------------------------
-- Table structure for `t_trade_record_2`
-- ----------------------------
DROP TABLE IF EXISTS `t_trade_record_2`;
CREATE TABLE `t_trade_record_2` (
  `id` varchar(80) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tradeId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_trade_record_2
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_0
-- ----------------------------
INSERT INTO `t_user_0` VALUES ('1', '10', 'lwl', '22');
INSERT INTO `t_user_0` VALUES ('2', '11', 'tommy', '1');
INSERT INTO `t_user_0` VALUES ('3', '13', 'war3 1.27', '25');
INSERT INTO `t_user_0` VALUES ('4', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_0` VALUES ('5', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_0` VALUES ('6', '13', '22222222222', '25');
INSERT INTO `t_user_0` VALUES ('7', '13', '异常....', '25');
INSERT INTO `t_user_0` VALUES ('10', '13', '异常....1111', '25');
INSERT INTO `t_user_0` VALUES ('11', '13', '异常....1111', '25');
INSERT INTO `t_user_0` VALUES ('13', '11', 'github', '25');
INSERT INTO `t_user_0` VALUES ('14', '9102', 'eeeeee', '22');

-- ----------------------------
-- Table structure for `t_user_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_1
-- ----------------------------
INSERT INTO `t_user_1` VALUES ('1', '10', 'lwl', '22');
INSERT INTO `t_user_1` VALUES ('2', '11', 'tommy', '1');
INSERT INTO `t_user_1` VALUES ('3', '13', 'war3 1.27', '25');
INSERT INTO `t_user_1` VALUES ('4', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_1` VALUES ('5', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_1` VALUES ('6', '13', '22222222222', '25');
INSERT INTO `t_user_1` VALUES ('7', '13', '异常....', '25');
INSERT INTO `t_user_1` VALUES ('10', '13', '异常....1111', '25');
INSERT INTO `t_user_1` VALUES ('11', '13', '异常....1111', '25');
INSERT INTO `t_user_1` VALUES ('13', '11', 'github', '25');

-- ----------------------------
-- Table structure for `t_user_2`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_2
-- ----------------------------
INSERT INTO `t_user_2` VALUES ('1', '10', 'lwl', '22');
INSERT INTO `t_user_2` VALUES ('2', '11', 'tommy', '1');
INSERT INTO `t_user_2` VALUES ('3', '13', 'war3 1.27', '25');
INSERT INTO `t_user_2` VALUES ('4', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_2` VALUES ('5', '13', 'war3 1.27 good', '25');
INSERT INTO `t_user_2` VALUES ('6', '13', '22222222222', '25');
INSERT INTO `t_user_2` VALUES ('7', '13', '异常....', '25');
INSERT INTO `t_user_2` VALUES ('10', '13', '异常....1111', '25');
INSERT INTO `t_user_2` VALUES ('11', '13', '异常....1111', '25');
INSERT INTO `t_user_2` VALUES ('13', '11', 'github', '25');
