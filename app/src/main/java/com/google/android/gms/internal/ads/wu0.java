package com.google.android.gms.internal.ads;
import j6.l;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class wu0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public zd1 f12334a;

    /* renamed from: b, reason: collision with root package name */
    public final l f12335b;

    public wu0(l lVar) {
        this.f12335b = lVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zd1 zd1Var = this.f12334a;
        if (zd1Var != null) {
            zd1Var.f13144x = null;
            wu0 wu0Var = (wu0) ((ArrayDeque) zd1Var.f13143w).poll();
            zd1Var.f13144x = wu0Var;
            if (wu0Var != null) {
                wu0Var.executeOnExecutor((ThreadPoolExecutor) zd1Var.f13142v, new Object[0]);
            }
        }
    }
}
