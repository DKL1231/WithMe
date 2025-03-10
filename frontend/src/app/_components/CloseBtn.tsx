interface CloseBtnProps {
  handleClose: () => void; // handleClose는 인자가 없고 반환값이 void인 함수
}

export default function CloseBtn({ handleClose }: CloseBtnProps) {
  return (
    <svg
      stroke="currentColor"
      fill="currentColor"
      strokeWidth="0"
      viewBox="0 0 24 24"
      height="1.4em"
      width="1.4em"
      xmlns="http://www.w3.org/2000/svg"
      className="cursor-pointer"
      onClick={handleClose}
    >
      <path d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z"></path>
    </svg>
  );
}
