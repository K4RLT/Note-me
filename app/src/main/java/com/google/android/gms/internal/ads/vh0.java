package com.google.android.gms.internal.ads;
import f9.k;
import j9.d;
import k9.f0;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class vh0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11906d;

    public vh0(ot otVar, String str, String str2) {
        this.f11903a = 2;
        this.f11904b = str;
        this.f11905c = str2;
        this.f11906d = otVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f11903a) {
            case 0:
                wh0 wh0Var = (wh0) this.f11904b;
                Activity activity = (Activity) this.f11905c;
                d dVar = (d) this.f11906d;
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "confirm");
                wh0Var.B4(wh0Var.f12246z, "rtsdc", hashMap);
                activity.startActivity(k.C.f16815f.k(activity));
                wh0Var.z4();
                if (dVar != null) {
                    dVar.l();
                    return;
                }
                return;
            case 1:
                wh0 wh0Var2 = (wh0) this.f11904b;
                Activity activity2 = (Activity) this.f11905c;
                d dVar2 = (d) this.f11906d;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "confirm");
                wh0Var2.B4(wh0Var2.f12246z, "dialog_click", hashMap2);
                wh0Var2.y4(activity2, dVar2);
                return;
            default:
                ot otVar = (ot) this.f11906d;
                DownloadManager downloadManager = (DownloadManager) otVar.f9232y.getSystemService("download");
                try {
                    String str = (String) this.f11904b;
                    String str2 = (String) this.f11905c;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    f0 f0Var = k.C.f16813c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    return;
                } catch (IllegalStateException unused) {
                    otVar.n("Could not store picture.");
                    return;
                }
        }
    }

    public /* synthetic */ vh0(wh0 wh0Var, Activity activity, d dVar, int i) {
        this.f11903a = i;
        this.f11904b = wh0Var;
        this.f11905c = activity;
        this.f11906d = dVar;
    }
}
