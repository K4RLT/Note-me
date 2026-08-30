package ca;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import fa.y;

/* loaded from: classes.dex */
public class c extends DialogFragment {

    /* renamed from: u, reason: collision with root package name */
    public Dialog f4026u;

    /* renamed from: v, reason: collision with root package name */
    public DialogInterface.OnCancelListener f4027v;

    /* renamed from: w, reason: collision with root package name */
    public AlertDialog f4028w;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4027v;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f4026u;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f4028w == null) {
                Activity activity = getActivity();
                y.h(activity);
                this.f4028w = new AlertDialog.Builder(activity).create();
            }
            return this.f4028w;
        }
        return dialog;
    }
}
