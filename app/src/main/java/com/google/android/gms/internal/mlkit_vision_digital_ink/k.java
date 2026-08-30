package com.google.android.gms.internal.mlkit_vision_digital_ink;
import af.c;
import e0.a;
import f7.c;
import q.x;
import tc.c;
import x.p;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14537a;

    /* renamed from: d, reason: collision with root package name */
    public String f14540d;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14539c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final u f14538b = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.u] */
    public k(ew ewVar) {
        this.f14537a = ewVar.f14283a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final Pair a(Uri uri) {
        if (!p(uri)) {
            return this.f14538b.a(o(uri));
        }
        throw new IOException("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final boolean b(Uri uri) {
        return f7.c(o(uri)).isDirectory();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File c(android.net.Uri r9) {
        /*
            r8 = this;
            boolean r0 = r8.p(r9)
            if (r0 != 0) goto L9b
            android.content.Context r0 = r8.f14537a
            java.io.File r9 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f(r0, r9)
            boolean r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f14723b
            if (r1 == 0) goto L12
            goto L98
        L12:
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_digital_ink.nw> r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.class
            monitor-enter(r1)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f14723b     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            goto L98
        L1c:
            r9 = move-exception
            goto L99
        L1f:
            r2 = 1
            r3 = r2
        L21:
            r4 = 2
            r5 = 0
            r6 = 0
            if (r3 > r4) goto L59
            android.os.UserManager r4 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f14722a     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L34
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r0.getSystemService(r4)     // Catch: java.lang.Throwable -> L1c
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f14722a = r4     // Catch: java.lang.Throwable -> L1c
        L34:
            android.os.UserManager r4 = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f14722a     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L3a
            r6 = r2
            goto L5d
        L3a:
            boolean r7 = r4.isUserUnlocked()     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L4c
            if (r7 != 0) goto L4a
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L4c
            boolean r3 = r4.isUserRunning(r7)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L4c
            if (r3 != 0) goto L59
        L4a:
            r6 = r2
            goto L59
        L4c:
            r4 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r4)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f14722a = r5     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + 1
            goto L21
        L59:
            if (r6 == 0) goto L5d
            com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f14722a = r5     // Catch: java.lang.Throwable -> L1c
        L5d:
            if (r6 == 0) goto L61
            com.google.android.gms.internal.mlkit_vision_digital_ink.nw.f14723b = r2     // Catch: java.lang.Throwable -> L1c
        L61:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            if (r6 != 0) goto L98
            java.lang.Object r1 = r8.f14539c
            monitor-enter(r1)
            java.lang.String r2 = r8.f14540d     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L80
            android.content.Context r0 = r0.createDeviceProtectedStorageContext()     // Catch: java.lang.Throwable -> L7e
            java.io.File r0 = com.google.android.gms.internal.mlkit_vision_digital_ink.gn.k(r0)     // Catch: java.lang.Throwable -> L7e
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L7e
            r8.f14540d = r0     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r9 = move-exception
            goto L96
        L80:
            java.lang.String r0 = r8.f14540d     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = r9.getAbsolutePath()
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L8e
            goto L98
        L8e:
            af.c r9 = new af.c
            java.lang.String r0 = "Cannot access credential-protected data from direct boot"
            r9.<init>(r0)
            throw r9
        L96:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            throw r9
        L98:
            return r9
        L99:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r9
        L9b:
            java.lang.String r9 = "operation is not permitted in other authorities."
            q.x.p(r9)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.k.c(android.net.Uri):java.io.File");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final String d() {
        return "android";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final InputStream e(Uri uri) {
        if (!p(uri)) {
            File c10 = f7.c(o(uri));
            return new z(new FileInputStream(c10), c10);
        }
        throw new IOException("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final long f(Uri uri) {
        return this.f14538b.f(o(uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final boolean g(Uri uri) {
        if (!p(uri)) {
            return f7.c(o(uri)).exists();
        }
        throw new IOException("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final OutputStream h(Uri uri) {
        return this.f14538b.h(o(uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void i(Uri uri, Uri uri2) {
        this.f14538b.i(o(uri), o(uri2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void j(Uri uri) {
        this.f14538b.j(o(uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void k(Uri uri) {
        this.f14538b.k(o(uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final OutputStream l(Uri uri) {
        return this.f14538b.l(o(uri));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final Iterable m(Uri uri) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f14538b.m(o(uri));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Uri uri2 = (Uri) obj;
            try {
                Context context = this.f14537a;
                Pattern pattern = l.f14581a;
                tc.c cVar = new tc.c(context, 1);
                cVar.l(uri2.getPath());
                arrayList.add(cVar.k());
            } catch (IllegalArgumentException e) {
                throw new IOException(e);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j0
    public final void n(Uri uri) {
        this.f14538b.n(o(uri));
    }

    public final Uri o(Uri uri) {
        if (!p(uri)) {
            File c10 = c(uri);
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            e4 e4Var = h4.f14393v;
            n5.d(4, "initialCapacity");
            path.path(c10.getAbsolutePath());
            return path.encodedFragment(e0.a(h4.r(new Object[4], 0))).build();
        }
        throw new IOException("Operation across authorities is not allowed.");
    }

    public final boolean p(Uri uri) {
        if (!TextUtils.isEmpty(uri.getAuthority()) && !this.f14537a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }
}
