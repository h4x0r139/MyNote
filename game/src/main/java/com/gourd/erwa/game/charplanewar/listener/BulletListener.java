/*
 * Written by wei.Li and released to the public domain
 * Welcome to correct discussion as explained at
 *
 * -----------------------------------------------------------------
 *
 * GitHub:  https://github.com/GourdErwa
 * CSDN  :	http://blog.csdn.net/xiaohulunb
 * WeiBo :	http://www.weibo.com/xiaohulunb  	@GourdErwa
 * Email :	gourderwa@163.com
 *
 * Personal home page: http://grouderwa.com
 */

package charplanewar.erwa.listener;

import charplanewar.erwa.entity.Bullet;

/**
 * 子弹监听
 */
public interface BulletListener {

    boolean onBulletLocationChanged(Bullet b);

}
