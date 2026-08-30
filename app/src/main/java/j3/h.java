package j3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import n.r0;
import wa.v8;
import wa.w8;

/* loaded from: classes.dex */
public final class h extends v8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f18886a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f18887b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f18888c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f18889d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f18887b = constructor;
        f18886a = cls;
        f18888c = method2;
        f18889d = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i10, boolean z3) {
        try {
            return ((Boolean) f18888c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i10), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f18886a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f18889d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // wa.v8
    public final Typeface a(Context context, i3.e eVar, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f18887b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (i3.f fVar : eVar.f18178a) {
                int i10 = fVar.f18183f;
                File c10 = w8.c(context);
                if (c10 != null) {
                    try {
                        if (w8.a(c10, resources, i10)) {
                            try {
                                fileInputStream = new FileInputStream(c10);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer != null && f(obj, mappedByteBuffer, fVar.e, fVar.f18180b, fVar.f18181c)) {
                                }
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        c10.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return g(obj);
        }
        return null;
    }

    @Override // wa.v8
    public final Typeface b(Context context, m3.g[] gVarArr, int i) {
        Object obj;
        try {
            obj = f18887b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            r0 r0Var = new r0(0);
            int length = gVarArr.length;
            while (true) {
                if (i10 < length) {
                    m3.g gVar = gVarArr[i10];
                    Uri uri = gVar.f20605a;
                    ByteBuffer byteBuffer = (ByteBuffer) r0Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = w8.d(context, uri);
                        r0Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !f(obj, byteBuffer, gVar.f20606b, gVar.f20607c, gVar.f20608d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface g8 = g(obj);
                    if (g8 != null) {
                        return Typeface.create(g8, i);
                    }
                }
            }
        }
        return null;
    }
}
