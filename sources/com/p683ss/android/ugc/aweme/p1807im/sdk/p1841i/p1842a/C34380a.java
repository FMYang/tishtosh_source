package com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34386a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34388c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.i.a.a */
public final class C34380a extends SQLiteOpenHelper {
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C34387b.m78295b());
        sQLiteDatabase.execSQL(C34388c.m78317b());
        sQLiteDatabase.execSQL(C34386a.m78288b());
    }

    public C34380a(Context context, String str) {
        super(context, str, null, 16);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 9) {
            sQLiteDatabase.execSQL("drop table if exists SIMPLE_USER");
            sQLiteDatabase.execSQL(C34387b.m78295b());
            sQLiteDatabase.execSQL("drop table if exists USER_EXTRA");
            sQLiteDatabase.execSQL(C34388c.m78317b());
            return;
        }
        if (i == 9) {
            StringBuilder sb = new StringBuilder("alter table ");
            sb.append(C34387b.m78299c());
            sb.append(" add column ");
            sb.append(C34384b.COLUMN_SORT_WEIGHT.key);
            sb.append(" ");
            sb.append(C34384b.COLUMN_SORT_WEIGHT.type);
            sQLiteDatabase.execSQL(sb.toString());
            StringBuilder sb2 = new StringBuilder("alter table ");
            sb2.append(C34387b.m78299c());
            sb2.append(" add column ");
            sb2.append(C34384b.COLUMN_INITIAL_LETTER.key);
            sb2.append(" ");
            sb2.append(C34384b.COLUMN_INITIAL_LETTER.type);
            sQLiteDatabase.execSQL(sb2.toString());
        }
        if (i <= 10) {
            StringBuilder sb3 = new StringBuilder("alter table ");
            sb3.append(C34387b.m78299c());
            sb3.append(" add column ");
            sb3.append(C34384b.COLUMN_SHORT_ID.key);
            sb3.append(" ");
            sb3.append(C34384b.COLUMN_SHORT_ID.type);
            sQLiteDatabase.execSQL(sb3.toString());
            StringBuilder sb4 = new StringBuilder("alter table ");
            sb4.append(C34387b.m78299c());
            sb4.append(" add column ");
            sb4.append(C34384b.COLUMN_REMARK_PINYIN.key);
            sb4.append(" ");
            sb4.append(C34384b.COLUMN_REMARK_PINYIN.type);
            sQLiteDatabase.execSQL(sb4.toString());
            StringBuilder sb5 = new StringBuilder("alter table ");
            sb5.append(C34387b.m78299c());
            sb5.append(" add column ");
            sb5.append(C34384b.COLUMN_REMARK_INITIAL.key);
            sb5.append(" ");
            sb5.append(C34384b.COLUMN_REMARK_INITIAL.type);
            sQLiteDatabase.execSQL(sb5.toString());
            StringBuilder sb6 = new StringBuilder("alter table ");
            sb6.append(C34387b.m78299c());
            sb6.append(" add column ");
            sb6.append(C34384b.COLUMN_NICK_NAME_PINYIN.key);
            sb6.append(" ");
            sb6.append(C34384b.COLUMN_NICK_NAME_PINYIN.type);
            sQLiteDatabase.execSQL(sb6.toString());
            StringBuilder sb7 = new StringBuilder("alter table ");
            sb7.append(C34387b.m78299c());
            sb7.append(" add column ");
            sb7.append(C34384b.COLUMN_NICK_NAME_INITIAL.key);
            sb7.append(" ");
            sb7.append(C34384b.COLUMN_NICK_NAME_INITIAL.type);
            sQLiteDatabase.execSQL(sb7.toString());
        }
        if (i <= 11) {
            StringBuilder sb8 = new StringBuilder("alter table ");
            sb8.append(C34387b.m78299c());
            sb8.append(" add column ");
            sb8.append(C34384b.COLUMN_COMMERCE_USER_LEVEL.key);
            sb8.append(" ");
            sb8.append(C34384b.COLUMN_COMMERCE_USER_LEVEL.type);
            sQLiteDatabase.execSQL(sb8.toString());
        }
        if (i <= 12) {
            StringBuilder sb9 = new StringBuilder("alter table ");
            sb9.append(C34387b.m78299c());
            sb9.append(" add column ");
            sb9.append(C34384b.COLUMN_SEC_UID.key);
            sb9.append(" ");
            sb9.append(C34384b.COLUMN_SEC_UID.type);
            sQLiteDatabase.execSQL(sb9.toString());
        }
        if (i <= 13) {
            StringBuilder sb10 = new StringBuilder("alter table ");
            sb10.append(C34387b.m78299c());
            sb10.append(" add column ");
            sb10.append(C34384b.COLUMN_CONTACT_NAME.key);
            sb10.append(" ");
            sb10.append(C34384b.COLUMN_CONTACT_NAME.type);
            sQLiteDatabase.execSQL(sb10.toString());
            StringBuilder sb11 = new StringBuilder("alter table ");
            sb11.append(C34387b.m78299c());
            sb11.append(" add column ");
            sb11.append(C34384b.COLUMN_CONTACT_NAME_PINYIN.key);
            sb11.append(" ");
            sb11.append(C34384b.COLUMN_CONTACT_NAME_PINYIN.type);
            sQLiteDatabase.execSQL(sb11.toString());
            StringBuilder sb12 = new StringBuilder("alter table ");
            sb12.append(C34387b.m78299c());
            sb12.append(" add column ");
            sb12.append(C34384b.COLUMN_CONTACT_NAME_INITIAL.key);
            sb12.append(" ");
            sb12.append(C34384b.COLUMN_CONTACT_NAME_INITIAL.type);
            sQLiteDatabase.execSQL(sb12.toString());
        }
        if (i <= 14) {
            StringBuilder sb13 = new StringBuilder("alter table ");
            sb13.append(C34387b.m78299c());
            sb13.append(" add column ");
            sb13.append(C34384b.COLUMN_USER_SHARE_STATUS.key);
            sb13.append(" ");
            sb13.append(C34384b.COLUMN_USER_SHARE_STATUS.type);
            sQLiteDatabase.execSQL(sb13.toString());
        }
        if (i <= 15) {
            sQLiteDatabase.execSQL("drop table if exists FRIENDS_RELATION");
            sQLiteDatabase.execSQL(C34386a.m78288b());
        }
    }
}
