package dev.medzik.bitwardenexportparser;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class VaultItemCard {
    public String cardholderName;
    public String brand;
    public String number;
    public String expMonth;
    public String expYear;
    public String code;
}
