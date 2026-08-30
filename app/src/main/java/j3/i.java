package j3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import wa.v8;
import wa.w8;

/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: f, reason: collision with root package name */
    public final Class f18890f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor f18891g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f18892h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f18893j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f18894k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f18895l;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = k(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = l(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f18890f = cls;
        this.f18891g = constructor;
        this.f18892h = method2;
        this.i = method3;
        this.f18893j = method4;
        this.f18894k = method5;
        this.f18895l = method;
    }

    public static Method k(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // j3.g, wa.v8
    public final Typeface a(Context context, i3.e eVar, Resources resources, int i) {
        Object obj;
        Method method = this.f18892h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f18891g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                i3.f[] fVarArr = eVar.f18178a;
                int length = fVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        i3.f fVar = fVarArr[i10];
                        Context context2 = context;
                        if (!h(context2, obj, fVar.f18179a, fVar.e, fVar.f18180b, fVar.f18181c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f18182d))) {
                            try {
                                this.f18894k.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            i10++;
                            context = context2;
                        }
                    } else if (j(obj)) {
                        return i(obj);
                    }
                }
            }
            return null;
        }
        return super.a(context, eVar, resources, i);
    }

    @Override // j3.g, wa.v8
    public final Typeface b(Context context, m3.g[] gVarArr, int i) {
        Object obj;
        Typeface i10;
        boolean z3;
        if (gVarArr.length >= 1) {
            Method method = this.f18892h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (m3.g gVar : gVarArr) {
                        if (gVar.e == 0) {
                            Uri uri = gVar.f20605a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, w8.d(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f18891g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = gVarArr.length;
                        int i11 = 0;
                        boolean z9 = false;
                        while (true) {
                            Method method2 = this.f18894k;
                            if (i11 < length) {
                                m3.g gVar2 = gVarArr[i11];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f20605a);
                                if (byteBuffer != null) {
                                    try {
                                        z3 = ((Boolean) this.i.invoke(obj, byteBuffer, Integer.valueOf(gVar2.f20606b), null, Integer.valueOf(gVar2.f20607c), Integer.valueOf(gVar2.f20608d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z9 = true;
                                }
                                i11++;
                                z9 = z9;
                            } else if (!z9) {
                                method2.invoke(obj, null);
                            } else if (j(obj) && (i10 = i(obj)) != null) {
                                return Typeface.create(i10, i);
                            }
                        }
                    }
                } else {
                    m3.g e = v8.e(gVarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e.f20605a, "r", null);
                    if (openFileDescriptor == null) {
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                            return null;
                        }
                    } else {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e.f20607c).setItalic(e.f20608d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // wa.v8
    public final Typeface d(Context context, Resources resources, int i, String str, int i10) {
        Object obj;
        Method method = this.f18892h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f18891g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!h(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.f18894k.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (j(obj)) {
                    return i(obj);
                }
            }
            return null;
        }
        return super.d(context, resources, i, str, i10);
    }

    public final boolean h(Context context, Object obj, String str, int i, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18892h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f18890f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f18895l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean j(Object obj) {
        try {
            return ((Boolean) this.f18893j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method l(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
