package com.kongzue.dialogx.dialogs;

import android.app.Activity;

import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;

import java.lang.ref.WeakReference;

/**
 * @author: Kongzue
 * @github: https://github.com/kongzue/
 * @homepage: http://kongzue.com/
 * @mail: myzcxhh@live.cn
 * @createTime: 2020/9/28 23:53
 */
public class TipDialog extends WaitDialog {
    
    /**
     * 参数 duration 使用此值，或小于 0 的任意整数时，
     * TipDialog 将不自动关闭
     */
    public static final int NO_AUTO_DISMISS = -1;
    
    protected TipDialog() {
        super();
    }
    
    public static WaitDialog show(int messageResId) {
        boolean noInstance = noInstance();
        if (noInstance) instanceBuild();
        me().setTip(messageResId, TYPE.WARNING);
        showWithInstance(noInstance);
        return me();
    }
    
    public static WaitDialog show(Activity activity, int messageResId) {
        boolean noInstance = noInstance(activity);
        if (noInstance) instanceBuild();
        WaitDialog instance = getInstanceNotNull(activity);
        instance.setTip(messageResId, TYPE.WARNING);
        showWithInstance(noInstance, activity);
        return instance;
    }
    
    public static WaitDialog show(CharSequence message) {
        boolean noInstance = noInstance();
        if (noInstance) instanceBuild();
        me().setTip(message, TYPE.WARNING);
        showWithInstance(noInstance);
        return me();
    }
    
    public static WaitDialog show(Activity activity, CharSequence message) {
        boolean noInstance = noInstance(activity);
        if (noInstance) instanceBuild();
        WaitDialog instance = getInstanceNotNull(activity);
        instance.setTip(message, TYPE.WARNING);
        showWithInstance(noInstance, activity);
        return instance;
    }
    
    public static WaitDialog show(int messageResId, TYPE tip) {
        boolean noInstance = noInstance();
        if (noInstance) instanceBuild();
        me().setTip(messageResId, tip);
        showWithInstance(noInstance);
        return me();
    }
    
    public static WaitDialog show(Activity activity, int messageResId, TYPE tip) {
        boolean noInstance = noInstance(activity);
        if (noInstance) instanceBuild();
        WaitDialog instance = getInstanceNotNull(activity);
        instance.setTip(messageResId, tip);
        showWithInstance(noInstance, activity);
        return instance;
    }
    
    public static WaitDialog show(CharSequence message, TYPE tip) {
        boolean noInstance = noInstance();
        if (noInstance) instanceBuild();
        me().setTip(message, tip);
        showWithInstance(noInstance);
        return me();
    }
    
    public static WaitDialog show(Activity activity, CharSequence message, TYPE tip) {
        boolean noInstance = noInstance(activity);
        if (noInstance) instanceBuild();
        WaitDialog instance = getInstanceNotNull(activity);
        instance.setTip(message, tip);
        showWithInstance(noInstance, activity);
        return instance;
    }
    
    public static WaitDialog show(int messageResId, TYPE tip, long duration) {
        boolean noInstance = noInstance();
        if (noInstance) instanceBuild();
        me().setTip(messageResId, tip);
        me().setTipShowDuration(duration);
        showWithInstance(noInstance);
        return me();
    }
    
    public static WaitDialog show(Activity activity, int messageResId, TYPE tip, long duration) {
        boolean noInstance = noInstance(activity);
        if (noInstance) instanceBuild();
        WaitDialog instance = getInstanceNotNull(activity);
        instance.setTip(messageResId, tip);
        instance.setTipShowDuration(duration);
        showWithInstance(noInstance, activity);
        return instance;
    }
    
    public static WaitDialog show(CharSequence message, TYPE tip, long duration) {
        boolean noInstance = noInstance();
        if (noInstance) instanceBuild();
        me().setTip(message, tip);
        me().setTipShowDuration(duration);
        showWithInstance(noInstance);
        return me();
    }
    
    public static WaitDialog show(Activity activity, CharSequence message, TYPE tip, long duration) {
        boolean noInstance = noInstance(activity);
        if (noInstance) instanceBuild();
        WaitDialog instance = getInstanceNotNull(activity);
        instance.setTip(message, tip);
        instance.setTipShowDuration(duration);
        showWithInstance(noInstance, activity);
        return instance;
    }
    
    @Override
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }
    
    protected static void showWithInstance(boolean noInstance) {
        if (noInstance) {
            me().show();
        } else {
            me().refreshUI();
            me().showTip(me().readyTipType);
        }
    }
    
    protected static void showWithInstance(boolean noInstance, Activity activity) {
        if (noInstance) {
            me().show(activity);
        } else {
            me().refreshUI();
            me().showTip(me().readyTipType);
        }
    }
    
    public TipDialog setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
        refreshUI();
        return this;
    }
}
