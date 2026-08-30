package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class io {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f14477a;

    static {
        char[] cArr = new char[80];
        f14477a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(i, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sm smVar = tm.f15012v;
            sb2.append(n5.c(new sm(((String) obj).getBytes(vn.f15137a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof tm) {
            sb2.append(": \"");
            sb2.append(n5.c((tm) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof nn) {
            sb2.append(" {");
            c((nn) obj, sb2, i + 2);
            sb2.append("\n");
            b(i, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i11 = i + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb2, i11, "key", entry.getKey());
            a(sb2, i11, "value", entry.getValue());
            sb2.append("\n");
            b(i, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    public static void b(int i, StringBuilder sb2) {
        while (i > 0) {
            int i10 = 80;
            if (i <= 80) {
                i10 = i;
            }
            sb2.append(f14477a, 0, i10);
            i -= i10;
        }
    }

    public static void c(nn nnVar, StringBuilder sb2, int i) {
        int i10;
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = nnVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null) {
                i11 = i10;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i, substring.substring(0, substring.length() - 4), nn.j(method2, nnVar, new Object[0]));
                    i10 = i11;
                }
            } else {
                i11 = i10;
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i, substring.substring(0, substring.length() - 3), nn.j(method, nnVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object j10 = nn.j(method4, nnVar, new Object[0]);
                    if (method5 == null) {
                        if (j10 instanceof Boolean) {
                            if (!((Boolean) j10).booleanValue()) {
                            }
                            a(sb2, i, substring, j10);
                        } else if (j10 instanceof Integer) {
                            if (((Integer) j10).intValue() == 0) {
                            }
                            a(sb2, i, substring, j10);
                        } else if (j10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) j10).floatValue()) == 0) {
                            }
                            a(sb2, i, substring, j10);
                        } else if (j10 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) j10).doubleValue()) == 0) {
                            }
                            a(sb2, i, substring, j10);
                        } else {
                            if (j10 instanceof String) {
                                equals = j10.equals("");
                            } else if (j10 instanceof tm) {
                                equals = j10.equals(tm.f15012v);
                            } else if (j10 instanceof km) {
                                if (j10 == ((nn) ((nn) ((km) j10)).q(6, null))) {
                                }
                                a(sb2, i, substring, j10);
                            } else {
                                if ((j10 instanceof Enum) && ((Enum) j10).ordinal() == 0) {
                                }
                                a(sb2, i, substring, j10);
                            }
                            if (equals) {
                            }
                            a(sb2, i, substring, j10);
                        }
                    } else {
                        if (!((Boolean) nn.j(method5, nnVar, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i, substring, j10);
                    }
                }
            }
            i10 = i11;
        }
        if (nnVar instanceof kn) {
            Iterator c10 = ((kn) nnVar).zza.c();
            while (c10.hasNext()) {
                Map.Entry entry2 = (Map.Entry) c10.next();
                a(sb2, i, a.i("[", ((ln) entry2.getKey()).f14604u, "]"), entry2.getValue());
            }
        }
        yo yoVar = nnVar.zzc;
        if (yoVar != null) {
            for (int i13 = 0; i13 < yoVar.f15294a; i13++) {
                a(sb2, i, String.valueOf(yoVar.f15295b[i13] >>> 3), yoVar.f15296c[i13]);
            }
        }
    }
}
