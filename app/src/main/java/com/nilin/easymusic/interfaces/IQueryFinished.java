/**
 * Copyright (c) www.longdw.com
 */
package com.nilin.easymusic.interfaces;

import java.util.List;

import com.nilin.easymusic.model.MusicInfo;

public interface IQueryFinished {
	
	public void onFinished(List<MusicInfo> list);

}
