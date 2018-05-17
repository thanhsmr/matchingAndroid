package com.example.hiep.myapplication.utility;

import android.app.Activity;
import android.content.DialogInterface;

import com.example.hiep.myapplication.R;

/**
 * Created by hiepnd6741 on 03/08/2017
 */

public class DialogUtils {
    public static android.app.AlertDialog showDialog(Activity activity, String message) {
        android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(activity)
                .setMessage(message)
                .setPositiveButton(activity.getString(R.string.dialog_ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                }).create();

        dialog.show();
        return dialog;
    }

    public static android.app.AlertDialog showDialog(Activity activity, String message, String messagePositiveButton) {
        android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(activity)
                .setMessage(message)
                .setPositiveButton(messagePositiveButton, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                }).create();

        dialog.show();
        return dialog;
    }


    public static android.app.AlertDialog showDialog(Activity activity, String message, String messagePositiveButton, DialogInterface.OnClickListener onCLickPositiveButton) {
        android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(activity)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(messagePositiveButton, onCLickPositiveButton).create();

        dialog.show();
        return dialog;
    }

    public static android.app.AlertDialog showDialog(Activity activity, String title, String message, String messagePositiveButton, DialogInterface.OnClickListener onCLickPositiveButton) {
        android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(activity)
                .setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(messagePositiveButton, onCLickPositiveButton).create();

        dialog.show();
        return dialog;
    }

    public static android.app.AlertDialog showDialog(Activity activity, String message, String messagePositiveButton, String messgaeNegativeButton,
                                                     DialogInterface.OnClickListener onCLickPositiveButton, DialogInterface.OnClickListener onCLickNativeButton) {
        android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(activity)
                .setMessage(message)
                .setNegativeButton(messgaeNegativeButton, onCLickNativeButton)
                .setPositiveButton(messagePositiveButton, onCLickPositiveButton).create();

        dialog.show();
        return dialog;
    }

    public static android.app.AlertDialog showDialog(Activity activity, String title, String message, String messagePositiveButton, String messgaeNegativeButton,
                                                     DialogInterface.OnClickListener onCLickPositiveButton, DialogInterface.OnClickListener onCLickNativeButton) {
        android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(activity)
                .setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton(messgaeNegativeButton, onCLickNativeButton)
                .setPositiveButton(messagePositiveButton, onCLickPositiveButton).create();
        dialog.show();
        return dialog;
    }

    public static android.app.AlertDialog showDialog(Activity activity, String message, DialogInterface.OnClickListener onCLickPositiveButton, boolean isCancelable) {
        android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(activity)
                .setMessage(message)
                .setPositiveButton(activity.getString(R.string.dialog_ok), onCLickPositiveButton).create();
        dialog.setCancelable(isCancelable);
        dialog.setCanceledOnTouchOutside(isCancelable);
        dialog.show();
        return dialog;
    }

    public static android.app.AlertDialog showDialog(Activity activity, String message, String messagePositiveButton,
                                                     DialogInterface.OnClickListener onCLickPositiveButton, boolean isCancelable) {
        android.app.AlertDialog dialog = new android.app.AlertDialog.Builder(activity)
                .setMessage(message)
                .setPositiveButton(messagePositiveButton, onCLickPositiveButton).create();
        dialog.setCancelable(isCancelable);
        dialog.setCanceledOnTouchOutside(isCancelable);
        dialog.show();
        return dialog;
    }

}
