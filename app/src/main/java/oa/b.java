package oa;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.oh;
import fa.y;
import java.lang.reflect.Field;
import q.x;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.internal.play_billing.d implements a {

    /* renamed from: v, reason: collision with root package name */
    public final Object f21866v;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 4);
        this.f21866v = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oa.a, com.google.android.gms.internal.ads.oh] */
    public static a v1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 5);
    }

    public static Object z1(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f21866v;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            y.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e8) {
                    throw new IllegalArgumentException("Binder object is null.", e8);
                }
            }
            x.n("IObjectWrapper declared field not private!");
            return null;
        }
        int length = declaredFields.length;
        x.n(a5.a.f(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        return null;
    }
}
