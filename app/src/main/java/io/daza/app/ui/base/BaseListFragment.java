/**
 * Copyright (C) 2015 JianyingLi <lijy91@foxmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.daza.app.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import org.blankapp.app.ListFragment;


public abstract class BaseListFragment<VH extends RecyclerView.ViewHolder, Item, Result> extends
        ListFragment<VH, Item, Result> {

    @Override
    public void onRefresh() {
        this.forceLoad();
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onLoadStart() {

    }

    @Override
    public void onLoadError(Exception e) {
        e.printStackTrace();
    }
}