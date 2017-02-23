/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

/** @author xpenatan */
public class btCollisionAlgorithm extends BulletBase {

    public btCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
        resetObj(cPtr, cMemoryOwn);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btCollisionAlgorithm);",this);
	}

    public void getAllContactManifolds(btManifoldArray manifoldArray) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("mObj",manifoldArray.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.getAllContactManifolds(mObj);",this);
    }
}