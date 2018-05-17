package com.example.hiep.myapplication.utility;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.hiep.myapplication.system.MyApp;
/**
 * Created by hiepnd6741 on 11/07/2017
 */

public class SharedPreferencesUtil {
    private SharedPreferences mSp;

    private static SharedPreferencesUtil instance;

    public static SharedPreferencesUtil getInstance() {
        if (instance == null)
            instance = new SharedPreferencesUtil("torecare");
        return instance;
    }

    private SharedPreferencesUtil(String nameShare) {
        this.mSp = MyApp.getContext().getSharedPreferences(nameShare, Context.MODE_PRIVATE);
    }

    private boolean executeWithEditor(SharedPreferencesUtil.Executable executable) {
        SharedPreferences.Editor edit = this.mSp.edit();
        executable.excute(edit);
        return edit.commit();
    }

    public void clearALL() {
        this.executeWithEditor(new SharedPreferencesUtil.Executable() {
            public void excute(SharedPreferences.Editor editor) {
                editor.clear();
            }
        });
    }



    public SharedPreferences getSharedPreferences() {
        return this.mSp;
    }

    public SharedPreferences.Editor getEditor() {
        return this.mSp.edit();
    }

    public boolean getBoolean(String key, boolean defValue) {
        return this.mSp.getBoolean(key, defValue);
    }


    public float getFloat(String key, float defValue) {
        return this.mSp.getFloat(key, defValue);
    }

    public int getInt(String key, int defValue) {
        return this.mSp.getInt(key, defValue);
    }

    public long getLong(String key, long defValue) {
        return this.mSp.getLong(key, defValue);
    }

    public String getString(String key, String defValue) {
        return this.mSp.getString(key, defValue);
    }

    public boolean put(final String key, final float value) {
        return this.executeWithEditor(new SharedPreferencesUtil.Executable() {
            public void excute(SharedPreferences.Editor editor) {
                editor.putFloat(key, value);
            }
        });
    }

    public boolean put(final String key, final int value) {
        return this.executeWithEditor(new SharedPreferencesUtil.Executable() {
            public void excute(SharedPreferences.Editor editor) {
                editor.putInt(key, value);
            }
        });
    }

    public boolean put(final String key, final long value) {
        return this.executeWithEditor(new SharedPreferencesUtil.Executable() {
            public void excute(SharedPreferences.Editor editor) {
                editor.putLong(key, value);
            }
        });
    }

    public boolean put(final String key, final String value) {
        return this.executeWithEditor(new SharedPreferencesUtil.Executable() {
            public void excute(SharedPreferences.Editor editor) {
                editor.putString(key, value);
            }
        });
    }

    public boolean put(final String key, final boolean value) {
        return this.executeWithEditor(new SharedPreferencesUtil.Executable() {
            public void excute(SharedPreferences.Editor editor) {
                editor.putBoolean(key, value);
            }
        });
    }

    public void remove(final String key) {
        this.executeWithEditor(new SharedPreferencesUtil.Executable() {
            public void excute(SharedPreferences.Editor editor) {
                editor.remove(key);
            }
        });
    }

    interface Executable {
        void excute(SharedPreferences.Editor editor);
    }
}
