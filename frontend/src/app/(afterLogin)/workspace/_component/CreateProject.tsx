import RepoList from './RepoList';
import { useState } from 'react';

interface CreateProjectProps {
  onNextClick: (isClosed: boolean) => void;
}

export default function CreateProject({ onNextClick }: CreateProjectProps) {
  const [searchText, setSearchText] = useState('');

  const handleSearchChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    setSearchText(event.target.value);
  };

  return (
    <>
      <input
        type="text"
        className="search-input"
        placeholder="Find a repository..."
        value={searchText}
        onChange={handleSearchChange}
      />
      <RepoList searchText={searchText} />
      <div className="w-full flex justify-center">
        <button className="create-button" onClick={() => onNextClick(true)}>
          Next
        </button>
      </div>
      <style jsx>{`
        .search-input {
          width: 100%;
          padding: 8px;
          margin: 10px 0;
          border: 1px solid #ccc;
          border-radius: 10px;
        }
        .create-button {
          background-color: white;
          color: black;
          border: 2px solid black;
          margin: 0 auto;
          padding: 5px;
          border-radius: 10px;
          width: 50%;
          cursor: pointer;
          margin-top: 10px;
        }
        .create-button:hover {
          background-color: #020623;
          color: white;
        }
      `}</style>
    </>
  );
}
