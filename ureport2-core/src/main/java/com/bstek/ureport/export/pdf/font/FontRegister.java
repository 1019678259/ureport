/*******************************************************************************
 * Copyright (C) 2017 Bstek.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.bstek.ureport.export.pdf.font;
/**
 * @author Jacky.gao
 * @since 2014年4月22日
 */
public interface FontRegister {
	/**
	 * @return 返回自定义的字体名称
	 */
	String getFontName();
	/**
	 * 返回字体所在位置，需要注意的是字体文件需要放置到classpath下，这里返回的值就是该字体文件所在classpath下位置即可
	 * @return 返回字体所在位置
	 */
	String getFontPath();
}
