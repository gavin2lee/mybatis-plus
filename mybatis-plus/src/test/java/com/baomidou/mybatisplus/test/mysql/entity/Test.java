/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.test.mysql.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 * <p>
 * 测试没有XML同样注入CRUD SQL 实体
 * </p>
 *
 * @author Caratacu
 * @Date 2016-09-25
 */
//表名为 test 可以不需要注解，特殊如 @TableName("tb_test")
public class Test extends Model<Test> {

	// 静态属性会自动忽略
	private static final long serialVersionUID = 1L;

	/** 主键 */
	// 默认会找 id 为主键，特殊命名需要注解 @TableId
	private Long id;

	private String type;

	public Test() {

	}

	public Test(Long id, String type) {
		this.id = id;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	protected Serializable getPrimaryKey() {
		return id;
	}

	public String toString() {
		return "{id=" + id + ",type=" + type + "}";
	}
}
