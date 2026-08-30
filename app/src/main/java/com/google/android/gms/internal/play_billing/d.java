package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class d extends Binder implements IInterface {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15399u;

    public d(String str, int i) {
        this.f15399u = i;
        switch (i) {
            case 3:
                attachInterface(this, str);
                return;
            case 4:
                attachInterface(this, str);
                return;
            case 5:
            default:
                attachInterface(this, str);
                return;
            case 6:
                attachInterface(this, str);
                return;
        }
    }

    public abstract boolean M0(Parcel parcel, int i);

    public abstract boolean R0(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f15399u;
        return this;
    }

    public boolean o1(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (super.onTransact(r26, r27, r28, r29) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        if (super.onTransact(r26, r27, r28, r29) != false) goto L63;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTransact(int r26, android.os.Parcel r27, android.os.Parcel r28, int r29) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.d.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public abstract boolean t1(Parcel parcel, int i);

    public /* synthetic */ d(int i) {
        this.f15399u = i;
    }
}
