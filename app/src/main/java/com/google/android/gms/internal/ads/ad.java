package com.google.android.gms.internal.ads;
import a5.a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4458a;

    /* renamed from: b, reason: collision with root package name */
    public int f4459b;

    public ad(int i) {
        switch (i) {
            case 2:
                this.f4458a = new ArrayList();
                this.f4459b = 128;
                return;
            default:
                this.f4458a = new ArrayList();
                this.f4459b = 0;
                return;
        }
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.f4458a));
    }

    public synchronized boolean b(List list) {
        this.f4458a.clear();
        if (list.size() > this.f4459b) {
            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f4459b, null);
            return this.f4458a.addAll(list.subList(0, this.f4459b));
        }
        return this.f4458a.addAll(list);
    }

    public int c(long j10) {
        long j11;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        int i17 = i16 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j12 = jArr[0];
        long j13 = jArr[1];
        long j14 = jArr[2];
        long j15 = jArr[3];
        long j16 = jArr[4];
        long j17 = jArr[5];
        long j18 = jArr[6];
        long j19 = jArr[7];
        long j20 = (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17) + j18;
        long j21 = j19 % 438792350;
        if (j10 >= 0) {
            j11 = (this.f4459b + (w10 ^ i17)) - j10;
        } else {
            j11 = (j20 ^ j21) + (-j10);
        }
        if (j11 >= 0 && j11 < this.f4459b) {
            return (int) j11;
        }
        throw new Exception();
    }

    public void d(id idVar) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        int i17 = this.f4459b;
        if (i17 < ((i16 % 937558955) ^ w10)) {
            ArrayList arrayList = this.f4458a;
            if (i17 == arrayList.size()) {
                arrayList.add(idVar);
            } else {
                arrayList.set(this.f4459b, idVar);
            }
            this.f4459b++;
            return;
        }
        throw new Exception();
    }

    public id e() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int w10 = a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        int i17 = i16 % 459541652;
        int i18 = this.f4459b;
        if (i18 > 0) {
            int i19 = i17 ^ w10;
            ArrayList arrayList = this.f4458a;
            id idVar = (id) arrayList.get(i18 + i19);
            arrayList.set(this.f4459b + i19, null);
            this.f4459b += i19;
            return idVar;
        }
        throw new Exception();
    }

    public id f(long j10) {
        return (id) this.f4458a.get(c(j10));
    }

    public ad(ArrayList arrayList) {
        this.f4459b = 0;
        this.f4458a = arrayList;
    }
}
