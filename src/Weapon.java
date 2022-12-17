public class Weapon {
        private WeaponType name;

        private WeaponType weaponType;
        private Boss owner;

    private WeaponType getName() {
        return name;
    }

    private void setName(WeaponType name) {
        this.name = WeaponType.SWORD;
    }

    private WeaponType getWeaponType() {
        return weaponType;
    }

    private void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    private Boss getOwner() {
            return owner;
        }

        public void setOwner(Boss owner) {
            this.owner = owner;
        }

    }

