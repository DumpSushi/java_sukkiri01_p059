package p059;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// list 2-2
		{
			Instant i1 = Instant.now();
			Instant i2 = Instant.ofEpochMilli(31920291332L);
			long l = i2.toEpochMilli();

			ZonedDateTime z1 = ZonedDateTime.now();
			ZonedDateTime z2 = ZonedDateTime
					.of(2014,  1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

			Instant i3 = z2.toInstant();
			ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

			System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
			System.out.println(("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth()));
			if(z2.isEqual(z3))
			{
				System.out.println("これらは同じ瞬間を指しています");
			}
		}

		// list 2-3
		{
			LocalDateTime l1 = LocalDateTime.now();
			LocalDateTime l2 = LocalDateTime.of(2014,  1, 1, 9, 5, 0, 0);

			ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
			LocalDateTime l3 = z1.toLocalDateTime();
			System.out.println(l3);
		}
	}

}
