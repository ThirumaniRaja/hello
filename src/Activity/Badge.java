package Activity;

public sealed interface Badge permits GoldBadge, SilverBadge {
   String type();
}
